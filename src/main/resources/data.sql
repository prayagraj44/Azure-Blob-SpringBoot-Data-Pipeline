INSERT INTO usercollection (id, name, email, password, role, created_at) VALUES
('1', 'Alice Johnson', 'alice@example.com', 'password123', 'CLIENT', '2024-06-28 10:00:00'),
('2', 'Bob Smith', 'bob@example.com', 'password123', 'FREELANCER', '2024-06-28 11:00:00'),
('3', 'Charlie Brown', 'charlie@example.com', 'password123', 'FREELANCER', '2024-06-28 12:00:00'),
('4', 'Prayag Namdev', 'prayag@example.com', 'password123', 'FREELANCER', '2024-06-28 12:00:00'),
('5', 'Yograj Namdev', 'prayag@example.com', 'password123', 'FREELANCER', '2024-06-28 12:00:00');

INSERT INTO gig (id, title, description, scope, status, budget, created_at, client_id) VALUES
('101', 'Website Development', 'Develop a responsive website using modern frameworks.', 'Web development', 'Open', 1500.0, CURRENT_TIMESTAMP, '1'),
('102', 'Mobile App Design', 'Design UI/UX for a mobile application.', 'Mobile app design', 'In Progress', 1200.0, CURRENT_TIMESTAMP, '2'),
('103', 'Logo Design', 'Create a new logo for a startup company.', 'Graphic design', 'Open', 500.0, CURRENT_TIMESTAMP, '3'),
('104', 'Data Analysis', 'Perform data analysis on sales data.', 'Data analysis', 'Closed', 800.0, CURRENT_TIMESTAMP, '4'),
('105', 'Content Writing', 'Write SEO-friendly content for a blog.', 'Content writing', 'Open', 300.0, CURRENT_TIMESTAMP, '5');

INSERT INTO time_logs (id, hours_worked, work_date, description, created_at, gig_id, freelancer_id) VALUES
('201', 5.5, '2024-06-29', 'Worked on frontend development.', CURRENT_TIMESTAMP, '101', '2'),
('202', 8.0, '2024-06-28', 'Designed user interface elements.', CURRENT_TIMESTAMP, '102', '3'),
('203', 4.5, '2024-06-27', 'Conducted data cleaning and preprocessing.', CURRENT_TIMESTAMP, '104', '4'),
('204', 6.0, '2024-06-26', 'Wrote articles on technology trends.', CURRENT_TIMESTAMP, '105', '5'),
('205', 7.5, '2024-06-25', 'Implemented responsive design for mobile screens.', CURRENT_TIMESTAMP, '101', '2');

INSERT INTO bid (id, amount, days_to_complete, status, created_at, gig_id, freelancer_id) VALUES
('301', 1200.0, 10, 'Pending', CURRENT_TIMESTAMP, '101', '3'),
('302', 800.0, 7, 'Accepted', CURRENT_TIMESTAMP, '102', '4'),
('303', 500.0, 5, 'Rejected', CURRENT_TIMESTAMP, '103', '5'),
('304', 1000.0, 8, 'Accepted', CURRENT_TIMESTAMP, '104', '2'),
('305', 300.0, 3, 'Pending', CURRENT_TIMESTAMP, '105', '1');
