CREATE TABLE books(
 book_id INT PRIMARY KEY AUTO_INCREMENT,
 book_name VARCHAR(200),
 book_image VARCHAR(200),
 book_synopsis VARCHAR(200),
 book_price DECIMAL(6,2),
 book_original_price DECIMAL(6,2),
 book_discount FLOAT,
 book_author VARCHAR(100),
 book_time DATE,
 book_press VARCHAR(50),
 book_description VARCHAR(1200)
)