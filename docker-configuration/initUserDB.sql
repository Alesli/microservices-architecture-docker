SELECT 'CREATE DATABASE usersdb' WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'usersdb');

\c usersdb;

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    amount_of_posts BIGINT DEFAULT 0
);