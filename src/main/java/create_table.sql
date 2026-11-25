CREATE TABLE section(
                        address_id INT AUTO_INCREMENT,
                        name VARCHAR(80) NOT NULL,
                        city VARCHAR(40) NOT NULL,
                        PRIMARY KEY (address_id)
);

CREATE TABLE employees (
                           first_name VARCHAR(20) NOT NULL,
                           last_name VARCHAR(20) NOT NULL,
                           email_address VARCHAR(60) NOT NULL UNIQUE,
                           date_of_hire DATE,
                           section_name VARCHAR(45) NOT NULL,
                           FOREIGN KEY (section_name) REFERENCES section(name),
                           PRIMARY KEY (email_address)
);

CREATE TABLE passcard(
                         card_number INT AUTO_INCREMENT UNIQUE,
                         date_of_issue DATE,
                         date_of_expire DATE
)