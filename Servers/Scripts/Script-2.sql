select f.fid , f.fname , f.createtime ,
s.sid , s.fid , s.symbol , s.share
from fund f left join fundstock s on f.fid = s.fid
where s.sid is null

