CREATE DATABASE BookSellerDB;
CREATE TABLE Customer(
CustomerID INT PRIMARY KEY,
FirstName VARCHAR(30),
LastName VARCHAR(30),
EMail VARCHAR(30),
Phone VARCHAR(30)
);

INSERT INTO Customer VALUES(5000, 'John','Smith','johnssmith@verizonet','555-340-1230');
INSERT INTO Customer VALUES(5002, 'Mary','Johnson','maryjohnson@concasr.net','55-1234567');
INSERT INTO Customer VALUES(5003, 'Bob','Collins','bob.collins@yahoo.com','55-012.3456');
INSERT INTO Customer VALUES(5006, 'Rebecca','Mayer','roiNcamayer@gmil.com','555-205-8212');
INSERT INTO Customer VALUES(5007, 'Anthony','Clark','anthonyclark@gmailicom','555-256-901');
INSERT INTO Customer VALUES(5008, 'Judy','Sousa','judy.sousa@vEri2on.net','555-7g1.1207');
INSERT INTO Customer VALUES(5009, 'Christopher','Patriquin','patriquinc@yahoo.com','55-3161803');
INSERT INTO Customer VALUES(5010, 'Deborah','Smith','debsmith@comeast.net','55-256-3421');