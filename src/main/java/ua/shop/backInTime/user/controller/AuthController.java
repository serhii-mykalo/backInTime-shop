package ua.shop.backInTime.user.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import ua.shop.backInTime.config.jwt.JwtUtils;
import ua.shop.backInTime.config.jwt.UserDetailsImpl;
import ua.shop.backInTime.user.controller.auth.request.LoginRequest;
import ua.shop.backInTime.user.controller.auth.request.SignupRequest;
import ua.shop.backInTime.user.controller.auth.response.JwtResponse;
import ua.shop.backInTime.user.service.UserService;
import ua.shop.backInTime.user.service.exception.UserAlreadyExistException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/V1/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired private UserService userService;
    @Autowired private JwtUtils jwtUtils;

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream().map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        return ResponseEntity
                .ok(new JwtResponse(jwt, userDetails.getId(), userDetails.getUsername(), userDetails.getEmail(), roles));
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) throws UserAlreadyExistException {
        userService.registerUser(signUpRequest.getUsername(), signUpRequest.getEmail(),
                signUpRequest.getPassword());
        return ResponseEntity.accepted().build();
    }
}
