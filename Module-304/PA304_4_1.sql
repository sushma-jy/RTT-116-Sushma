SELECT productName AS "Name", productLine AS "Product Line", buyPrice AS "Buy Price"
FROM products
ORDER BY buyPrice DESC;
---------------------------------------------------------------------------------
SELECT contactFirstName AS "First Name", contactLastName AS "Last Name", city AS "City"
FROM customers
WHERE country = 'Germany'
ORDER BY contactLastName ASC;
-------------------------------------------------------------------------------------
SELECT DISTINCT status
FROM orders
ORDER BY status ASC;
-----------------------------------------------------------------------------------
SELECT *
FROM payments
WHERE paymentDate >= '2005-01-01'
ORDER BY paymentDate DESC;
-----------------------------------------------------------------------------------
SELECT lastName AS "Last Name", firstName AS "First Name", email AS "Email Address", jobTitle AS "Job Title"
FROM employees
WHERE officeCode = (SELECT officeCode FROM offices WHERE city = 'San Francisco')
ORDER BY lastName ASC;
------------------------------------------------------------------------------------
SELECT productName AS "Name", productLine AS "Product Line", productScale AS "Scale", productVendor AS "Vendor"
FROM products
WHERE productLine IN ('Vintage Cars', 'Classic Cars')
ORDER BY CASE WHEN productLine = 'Vintage Cars' THEN 1
WHEN productLine = 'Classic Cars' THEN 2
END,
productName ASC;



