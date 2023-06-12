delete from passport;
delete from person;

insert into person (id,first_name, last_name) values(1,'Ivan', 'Ivanov');
insert into person (id,first_name, last_name) values(2,'John', 'Smith');

insert into passport (id,number,country) values(1,'DB2351345', 'BY');
insert into passport (id,number,country) values(2,'DB1233346', 'BY');

delete from comment;
delete from post;

insert into post (id,content) values(1,'Post 1');
insert into post (id,content) values(2,'Post 2');

insert into comment(id,content) values(1,'Comment 1');
insert into comment(id,content) values(2,'Comment 2');
UPDATE comment SET post_id = 1 WHERE comment.id=1;
UPDATE comment SET post_id = 2 WHERE comment.id=2;





