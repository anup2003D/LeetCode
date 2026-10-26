SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    -- Write a subquery to retrieve customer IDs from Orders
    select customerID from Orders
);