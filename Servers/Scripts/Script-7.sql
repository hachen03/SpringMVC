select s.symbol , sum(s.share) as share 
from fundstock s
group by s.symbol