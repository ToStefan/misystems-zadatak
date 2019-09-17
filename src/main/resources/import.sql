INSERT INTO carbodytype(id, name) VALUES(1, 'SUV');

INSERT INTO vehicletype(id, name) VALUES(1, 'car');
INSERT INTO vehicletype(id, name) VALUES(2, 'truck');

INSERT INTO fueltype(id, name) VALUES(1, 'dizel');
INSERT INTO fueltype(id, name) VALUES(2, 'benzin');

INSERT INTO manufacturer(id, name) VALUES(1, 'Audi');
INSERT INTO manufacturer(id, name) VALUES(2, 'BMW');

INSERT INTO model(id, name, manufacturer) VALUES(1, 'A8', 1);
INSERT INTO model(id, name, manufacturer) VALUES(2, 'Q7', 1);
INSERT INTO model(id, name, manufacturer) VALUES(3, 'X6', 2);
INSERT INTO model(id, name, manufacturer) VALUES(4, 'i8', 2);

INSERT INTO vehicle(id, model, vehicle_type, fuel_type, price, car_body_type, weight, horse_power, seat_count, door_count, description, propulsion, transmission, trunk_weight) VALUES(1, 1, 1, 2, 50, 1, 1300, 160, 4, 5, 'dosta dobar auto', 'front/back', 'automatic', 250);

INSERT INTO user(id, username, password, firstname, lastname, born_date, active) VALUES(1, 's', 's', 'Stefan', 'Tofilovic', null, 1);
INSERT INTO user(id, username, password, firstname, lastname, born_date, active) VALUES(2, 'v', 'v', 'Viktor', 'Nikolic', null, 1);

INSERT INTO rent(id, total_price, user, vehicle, rent_from, rent_to) VALUES(1, 450, 1, 1, null, null);

INSERT INTO role(id, name) VALUES(1, 'ROLE_CLIENT')
INSERT INTO role(id, name) VALUES(2, 'ROLE_ADMINISTRATOR');

INSERT INTO user_role(user_id, role_id) VALUES(1, 1);
INSERT INTO user_role(user_id, role_id) VALUES(1, 2);
INSERT INTO user_role(user_id, role_id) VALUES(2, 1);