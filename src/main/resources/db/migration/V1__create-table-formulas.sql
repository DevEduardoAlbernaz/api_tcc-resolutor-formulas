CREATE TABLE formulas(
id_formulas SERIAL PRIMARY KEY UNIQUE NOT NULL,
formula TEXT,
sintax TEXT,
pap TEXT,
resultado FLOAT
);
CREATE TABLE categorias(
id_categorias SERIAL PRIMARY KEY UNIQUE NOT NULL,
nome_Area_conhecimento TEXT NOT NULL
);