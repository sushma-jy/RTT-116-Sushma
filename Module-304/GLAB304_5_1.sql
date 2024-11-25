SELECT orderNumber, SUM(quantityOrdered) as Qty,
IF(MOD(SUM(quantityOrdered),2),'Odd', 'Even') as oddOrEven
FROM orderdetails
GROUP BY orderNumber
ORDER BY orderNumber; 
-------------------------------------------------------------------
SELECT TRUNCATE(1.555,1);
-------------------------------------------------------------------
SELECT productCode,
ROUND(AVG(quantityOrdered * priceEach)) as avg_order_item_value
FROM orderDetails
GROUP BY productCode;    
-------------------------------------------------------------------
SELECT   TRUNCATE(1.999,1),  ROUND(1.999,1);
-------------------------------------------------------------------
SELECT DATEDIFF('2011-08-17','2011-08-17');  
#Result  :   0 day

SELECT DATEDIFF('2011-08-17','2011-08-08'); 
#Result:  9 days

SELECT DATEDIFF('2011-08-08','2011-08-17');  
#Result:  -9 days
----------------------------------------------------------------------
SELECT orderNumber, DATEDIFF(requiredDate, shippedDate) as  daysLeft
FROM     orders
ORDER BY  daysLeft DESC;
--------------------------------------------------------------------------
SELECT orderNumber, DATEDIFF(requiredDate, orderDate) as remaining_days
FROM    orders
WHERE    status = 'In Process'
ORDER BY remaining_days;
-------------------------------------------------------------------------
SELECT 
    orderNumber,
    DATE_FORMAT(orderdate, '%Y-%m-%d') orderDate,
    DATE_FORMAT(requireddate, '%a %D %b %Y') requireddate,
    DATE_FORMAT(shippedDate, '%W %D %M %Y') shippedDate
FROM    orders;
----------------------------------------------------------------------------
SELECT     orderNumber,
    DATE_FORMAT(shippeddate, '%W %D %M %Y')  as 'Shipped date'
FROM    orders
ORDER BY shippeddate;
------------------------------------------------------------------------------
SELECT LPAD('hi',4,'??');       #Result   -> '??hi'

SELECT LPAD('hi',1,'??');     # Result -> 'h'

-----------------------------------------------------------------------------
SELECT firstName, LPAD(firstName,10,'kk'), LPAD(firstName,5,'kk'), LPAD(firstName,4,'kk') 
FROM classicmodels.employees;
-------------------------------------------------------------------------------------
SELECT TRIM(' SQL TRIM Function ');

---------------------------------------------------------------------------------------
SELECT YEAR(shippeddate) as year,  COUNT(ordernumber) as orderQty
FROM    orders 
GROUP BY YEAR(shippeddate)
ORDER BY YEAR(shippeddate);
----------------------------------------------------------------------------------











