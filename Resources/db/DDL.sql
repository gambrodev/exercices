CREATE TABLE Persons (
    PersonID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255) NOT NULL,
    FiscalCode varchar(255) NOT NULL,
    Birthday date,
    JoinDate date
);

CREATE TABLE Books (
    BookID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Title varchar(255) NOT NULL,
    Author varchar(255) NOT NULL,
    Shelf varchar(255) NOT NULL
);

CREATE TABLE BorrowedBooks (
	PersonID int,
	BookId int,
    BorrrowDate date,
    ReturnDate date,
    FOREIGN KEY (PersonID) REFERENCES Persons(PersonID),
    FOREIGN KEY (BookID) REFERENCES Books(BookID)
);