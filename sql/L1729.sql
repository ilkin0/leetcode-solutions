select f.user_id, count(f.follower_id) as followes_count
from Followers f
group by f.user_id
order by user_id asc;