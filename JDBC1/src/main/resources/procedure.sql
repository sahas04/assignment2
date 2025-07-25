DELIMITER $$

CREATE PROCEDURE employee(
    IN empName VARCHAR(100),
    IN dept VARCHAR(50),
    IN desig VARCHAR(50),
    IN email VARCHAR(100),
    IN sal DOUBLE
)
BEGIN
    INSERT INTO employee(emp_name, department, designation, email, salary)
    VALUES (empName, dept, desig, email, sal);
END$$

DELIMITER ;