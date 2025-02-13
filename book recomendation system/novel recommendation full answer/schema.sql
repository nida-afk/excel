CREATE TABLE users (
    userId INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    age INT,
    location VARCHAR(255)
);

CREATE TABLE books (
    bookId INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    genre VARCHAR(255),
    isbn VARCHAR(255) UNIQUE,
    publisher VARCHAR(255),
    yop INT,
    image VARCHAR(255)
);

CREATE TABLE ratings (
    ratingId INT AUTO_INCREMENT PRIMARY KEY,
    userId INT,
    bookId INT,
    ratingValue INT,
    FOREIGN KEY (userId) REFERENCES users(userId),
    FOREIGN KEY (bookId) REFERENCES books(bookId)
);

CREATE TABLE recommendations (
    recommendationId INT AUTO_INCREMENT PRIMARY KEY,
    userId INT,
    bookId INT,
    predictedRating FLOAT,
    FOREIGN KEY (userId) REFERENCES users(userId),
    FOREIGN KEY (bookId) REFERENCES books(bookId)
);

CREATE TABLE trust (
    trustorId INT,
    trusteeId INT,
    FOREIGN KEY (trustorId) REFERENCES users(userId),
    FOREIGN KEY (trusteeId) REFERENCES users(userId),
    PRIMARY KEY (trustorId, trusteeId)
);
