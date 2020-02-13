USE classicmodels;

SELECT customerName, lastName, firstName FROM customers c join employees e on salesRepEmployeeNumber = e.employeeNumber;

SELECT customerName 'Customer Name', 
CONCAT(lastName,', ', firstName) 'Sales Rep' 
FROM customers c join employees e on salesRepEmployeeNumber = e.employeeNumber 
ORDER BY customerName;

SELECT productName 'Product Name', SUM(quantityOrdered) 'Total # Ordered', priceEach 'Unit Price', SUM(quantityOrdered*priceEach) 'Total Sale' 
FROM products JOIN orderdetails  USING(productCode)  GROUP BY productName ORDER BY quantityOrdered*priceEach DESC;




