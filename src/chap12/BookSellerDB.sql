CREATE DATABASE BookSellerDB;
CREATE TABLE Customer(
CustomerID INTEGER PRIMARY KEY,
FirstName TEXT,
LastName TEXT,
EMail TEXT,
Phone TEXT
);

CREATE TABLE Book(
ISBN INTEGER PRIMARY KEY,
Title TEXT,
PubDate DATE,
Format TEXT,
UnitPrice NUMERIC(4,2)
);

INSERT INTO Customer VALUES(5000, 'John','Smith','johnssmith@verizonet','555-340-1230');
INSERT INTO Customer VALUES(5002, 'Mary','Johnson','maryjohnson@concasr.net','55-1234567');
INSERT INTO Customer VALUES(5003, 'Bob','Collins','bob.collins@yahoo.com','55-012.3456');
INSERT INTO Customer VALUES(5006, 'Rebecca','Mayer','roiNcamayer@gmil.com','555-205-8212');
INSERT INTO Customer VALUES(5007, 'Anthony','Clark','anthonyclark@gmailicom','555-256-901');
INSERT INTO Customer VALUES(5008, 'Judy','Sousa','judy.sousa@vEri2on.net','555-7g1.1207');
INSERT INTO Customer VALUES(5009, 'Christopher','Patriquin','patriquinc@yahoo.com','55-3161803');
INSERT INTO Customer VALUES(5010, 'Deborah','Smith','debsmith@comeast.net','55-256-342');

INSERT INTO Book VALUES(1234,'The Lost Hero','2012-03-02','Paperback',10.95);
INSERT INTO Book VALUES(343,'The Last Leopard','2008-12-02','Hardcover',16.95);
INSERT INTO Book VALUES(653,'The Kane','2010-03-02','Hardcover',12.95);
INSERT INTO Book VALUES(9833,'Survival Guide','2009-12-22','Hardcover',13.95);
INSERT INTO Book VALUES(2343,'Freaky Monday','2011-01-02','Paperback',14.95);
INSERT INTO Book VALUES(222,'Chronicles','2010-06-12','Hardcover',10.95);
INSERT INTO Book VALUES(987,'The House of the Scorpion','2012-03-02','Paperback',6.95);
INSERT INTO Book VALUES(332,'How to Train Your Dragon','2012-03-02','Hardcover',13.95);

UPDATE Book SET UnitPrice=8.95 WHERE UnitPrice<8.95 AND Format='Hardcover';

- Afficher le nom de l'auteur et le(s) book qu'il a écrit.
