CREATE TABLE IF NOT EXISTS transactions (
    id SERIAL PRIMARY KEY,
    type INT,
    dates DATE,
    amount DECIMAL(10, 2),
    cpf BIGINT,
    card VARCHAR(255),
    hours TIME,
    store_owner VARCHAR(255),
    store_name VARCHAR(255)
);