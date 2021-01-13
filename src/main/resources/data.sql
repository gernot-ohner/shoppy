insert into ingredient (id, name) values (1, 'milk');
insert into ingredient (id, name) values (2, 'greek yoghurt');
insert into ingredient (id, name) values (3, 'oats');
insert into ingredient (id, name) values (4, 'frozen blueberries');

insert into recipe (id, name) values (1, 'my breakfast');
insert into recipe (id, name) values (2, 'porridge');

insert into recipe_ingredients (recipe_id, ingredients_id) values (1, 1);
insert into recipe_ingredients (recipe_id, ingredients_id) values (1, 2);
insert into recipe_ingredients (recipe_id, ingredients_id) values (1, 3);
insert into recipe_ingredients (recipe_id, ingredients_id) values (1, 4);

insert into recipe_ingredients (recipe_id, ingredients_id) values (2, 1);
insert into recipe_ingredients (recipe_id, ingredients_id) values (2, 3);
insert into recipe_ingredients (recipe_id, ingredients_id) values (2, 4);
