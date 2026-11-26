-- Write insert querries for Section - Employee(s) - Passcards
USE iths_lab_felix_lab2;

INSERT INTO section (name, city) VALUES ('Deimos', 'Örebro');
INSERT INTO section (name, city) VALUES ('Phobos', 'Örebro');

INSERT INTO section (name, city) VALUES ('Triton', 'Stockholm');
INSERT INTO section (name,city ) values ('Proteus', 'Stockholm');
INSERT INTO section (name,city ) values ('Nereid', 'Stockholm');

INSERT INTO employees (first_name, last_name, email_address, date_of_hire, section_name)
VALUES ('Felix', 'Lamu', 'felix.lamu@kebab.se', '2026-11-26', 'Deimos');

INSERT INTO employees (first_name, last_name, email_address, date_of_hire, section_name)
VALUES ('Richard', 'Ivarsson', 'richard.ivarsson@kebab.se', '2026-11-26', 'Proteus');

INSERT INTO passcard (date_of_issue, date_of_expire, employee)
VALUES ('2026-11-26', '2027-11-26', 'felix.lamu@kebab.se');