INSERT INTO users (username, password, email, created_date, last_updated_date)
VALUES ('admin', '$2a$10$.IeRI/Gy/8UscmtMmMHyDe2PDe0TMLn.9vb6WUSS2FVtzGmEZzcj2', 'admin@gmail.com', NOW(), NOW()),
       ('auth user', '$2a$10$uZ/R0BFKt2MqlybEAcO2NebJkdp5qWI3G2SnssNn3HcMHEZAC61Nu', 'auth_user@gmail.com', NOW(), NOW()),
       ('user', '$2a$10$AcO2NebJkdp5qWI3dp50TMLn.9vbHcMHEZRI/Gy/8Uscmtgfds54', 'user@gmail.com', NOW(), NOW());

INSERT INTO roles (name) VALUES ('ADMIN'),('AUTH_USER'), ('USER');

INSERT INTO user_roles (user_id, role_id) VALUES (1, 1), (2, 2), (3, 3);