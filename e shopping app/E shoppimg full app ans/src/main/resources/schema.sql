CREATE TABLE customers (
    cid INT AUTO_INCREMENT PRIMARY KEY,
    cname VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phno VARCHAR(20) NOT NULL,
    paymentType VARCHAR(50) NOT NULL
);

CREATE TABLE products (
    pid INT AUTO_INCREMENT PRIMARY KEY,
    pname VARCHAR(255) NOT NULL,
    mrp FLOAT NOT NULL,
    discount FLOAT DEFAULT 0,
    mDate DATE,
    stock INT NOT NULL
);

CREATE TABLE sales (
    saleId INT AUTO_INCREMENT PRIMARY KEY,
    pid INT,
    cid INT,
    quantity INT NOT NULL,
    totalAmount FLOAT NOT NULL,
    FOREIGN KEY (pid) REFERENCES products(pid),
    FOREIGN KEY (cid) REFERENCES customers(cid)
);

CREATE TABLE managers (
    uid INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
