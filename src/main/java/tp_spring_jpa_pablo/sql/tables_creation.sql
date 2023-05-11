CREATE TABLE IF NOT EXISTS Article (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    type VARCHAR(50) NOT NULL,
    description VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS Fournisseur (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    email VARCHAR(80) NOT NULL,
    adresse VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS Utilisateur (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    email VARCHAR(80) NOT NULL,
    password VARCHAR(20)
);
CREATE TABLE IF NOT EXISTS Client (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(80) NOT NULL,
    email VARCHAR(80) NOT NULL,
    adresse VARCHAR(255)
);
