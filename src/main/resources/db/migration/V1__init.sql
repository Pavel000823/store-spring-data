CREATE TABLE products
(
    id    bigserial PRIMARY KEY,
    title VARCHAR(255),
    cost  numeric(8, 2)
);
INSERT INTO products (title, cost)
VALUES ('milk', 130.20),
       ('coffee', 1200),
       ('cheese', 3000),
       ('bread', 25.20),
       ('tea', 500),
       ('product2', 10000),
       ('product3', 2500),
       ('product4', 3000),
       ('product5', 4000),
       ('product7', 5000),
       ('product6', 1000),
       ('product8', 145.1),
       ('product9', 1455.2),
       ('product10', 8623.12),
       ('product11', 3555.11),
       ('product12', 4020.2),
       ('product13', 5999.99),
       ('product14', 1000),
       ('product15', 200.1),
       ('product16', 555.2);