-- verify attributes
-- Sections : Hold name, city and employees if any
CREATE TABLE section(
                        name VARCHAR(80) NOT NULL,
                        city VARCHAR(40) NOT NULL,
                        PRIMARY KEY (name),
);


-- verify attributes
-- Employees: hold first name, last name, email address that is unique, date of hiring, section name !important
-- employee table requires a section as an employee can't be hired at no section.
CREATE TABLE employees (
                           first_name VARCHAR(20) NOT NULL,
                           last_name VARCHAR(20) NOT NULL,
                           email_address VARCHAR(60) NOT NULL UNIQUE,
                           date_of_hire DATE,
                           section_name VARCHAR(45) NOT NULL,
                           FOREIGN KEY (section_name) REFERENCES section(name),
                           PRIMARY KEY (email_address)
);
-- verify attributes
-- Passcard: hold card number, date of issue and expire date.
-- An employee can only have one passcard but not all employees get a passcard
-- Additionally a passcard can only be assigned to one employee - Almost works as a identifier to certain employees.
CREATE TABLE passcard(
                        card_number INT AUTO_INCREMENT UNIQUE,
                        date_of_issue DATE,
                        date_of_expire DATE,
                        employee,
                        FOREIGN KEY (employee) REFERENCES employees(email_address)
)