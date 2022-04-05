select f.fid , f.fname ,0 from fund f
union all
select s.sid , s.symbol ,0 from fundstock s
union all
select b.bid , b.bname, b.price from book b