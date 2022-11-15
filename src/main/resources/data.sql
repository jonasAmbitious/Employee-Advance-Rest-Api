INSERT INTO STAFF (STAFF_ID, FIRST_NAME, LAST_NAME, IDENTITY_NO, AGE,JOP_KEY,LOCATION_KEY ) VALUES
( 100, 'Jonas', 'Chirindza', '000701', 22,11,1 ),
( 101, 'Neo', 'Maja', '010102', 21 ,22,2),
( 102, 'Lazarus', 'Maseko', '990831', 23,33,3 ),
( 103, 'Sipho', 'Malinga', '980707', 24, 44,4),
( 104, 'Shaun', 'Molefe', '940201', 28, 55,5);

INSERT INTO STAFF_JOB (JOP_KEY,STAFF_ID, JOB_NAME, JOB_DEPARTMENT, JOB_LEVEL, TEAM_NAME, MANAGER_NO) VALUES
(11,100, 'Developer', 'SOE', 'Staff Level', 'Data Management', '1001'  ),
(22,101, 'Developer', 'DHS', 'Staff Level', 'Care and Claims', '1201'  ),
(33,102, 'Business Analyst', 'SOE', 'Mid Level', 'Data Management', '1001'  ),
(44,103, 'System Analyst', 'SOE', 'Mid Level', 'Data Management', '1001'  ),
(55,104, 'Developer', 'DHS', 'Senior', 'Care and Claims', '1201'  );

INSERT INTO STAFF_EMAIL (STAFF_ID, EMAIL, EMAIL_ACTIVE) VALUES
(100, 'jonasC@analytics.com', 'Y'  ),
(100, 'jc@gmail.com', 'Y'  ),
(101, 'neoM@analytics.com', 'Y'  ),
(100, 'jc01@gmail.com', 'N'  ),
(102, 'lazarusM@analytics.com', 'Y'  ),
(102, 'lassies@gmail.com', 'Y'  ),
(103, 'siphoM@analytics.com', 'Y'  ),
(104, 'shaunM@analytics.com', 'Y'  );

INSERT INTO STAFF_LOCATION (LOCATION_KEY,STAFF_ID, CITY, PROVINCE, COUNTRY) VALUES
(1,'100', 'Sandton', 'Gauteng','South Africa'),
(2,'101', 'Centurion', 'Gauteng','South Africa'),
(3,'102', 'Cape Town', 'Western Cape','South Africa'),
(4,'103', 'Sandton', 'Gauteng','South Africa'),
(5,'104', 'Durban', 'KZN','South Africa') ;

COMMIT ;

