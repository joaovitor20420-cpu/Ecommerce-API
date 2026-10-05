CREATE TABLE tb_roles(
    id BIGSERIAL PRIMARY KEY,
    authority VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE tb_user(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,

    role_id BIGINT NOT NULL,
    CONSTRAINT fk_user_roles FOREIGN KEY (role_id) REFERENCES tb_roles (id)
);

INSERT INTO tb_roles (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_roles (authority) VALUES ('ROLE_CLIENT');