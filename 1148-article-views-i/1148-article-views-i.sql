# Write your MySQL query statement below
select distinct(viewer_id) as id from views as vs
where author_id = viewer_id group by id order by id