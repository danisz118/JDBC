CREATE TABLE cars
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    mark_id INT(11) NOT NULL,
    model VARCHAR(20) NOT NULL,
    price INT(11) NOT NULL,
    CONSTRAINT cars_ibfk_1 FOREIGN KEY (mark_id) REFERENCES marks (id)
);
CREATE INDEX mark_id ON cars (mark_id);
CREATE TABLE clients
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(30),
    age TINYINT(4),
    phone VARCHAR(15)
);
CREATE TABLE dish
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(45),
    description VARCHAR(45),
    rating DOUBLE(9,2),
    published TINYINT(4),
    created DATE,
    icon LONGBLOB
);
CREATE TABLE marks
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    mark VARCHAR(20)
);
CREATE UNIQUE INDEX mark ON marks (mark);
CREATE TABLE orders
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    car_id INT(11) NOT NULL,
    client_id INT(11) NOT NULL,
    CONSTRAINT orders_ibfk_1 FOREIGN KEY (car_id) REFERENCES cars (id),
    CONSTRAINT orders_ibfk_2 FOREIGN KEY (client_id) REFERENCES clients (id)
);
CREATE INDEX car_id ON orders (car_id);
CREATE INDEX client_id ON orders (client_id);
CREATE TABLE test_table
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    value VARCHAR(45),
    date DATETIME
);
