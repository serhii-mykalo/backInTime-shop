INSERT INTO users (username, password, email, created_date, last_updated_date)
VALUES ('admin', 'b6WUSS2FVtzGmEZzcj2', 'admin@gmail.com', NOW(), NOW()),
       ('auth user', 'dp5qWI3G2SnssNn3HcM', 'auth_user@gmail.com', NOW(), NOW()),
       ('user', 'ng3gfhgfghd57456r', 'user@gmail.com', NOW(), NOW());

INSERT INTO roles (name) VALUES ('ADMIN'),('AUTH_USER'), ('USER');

INSERT INTO user_roles (user_id, role_id) VALUES (1, 1), (2, 2), (3, 3);