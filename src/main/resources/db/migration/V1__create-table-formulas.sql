CREATE TABLE formulas(
id_formulas SERIAL PRIMARY KEY UNIQUE NOT NULL,
formula TEXT,
sintax TEXT,
pap TEXT,
resultado FLOAT
);