select s.sid, s.fid, s.symbol, s.share , f.fid as fund_fid , f.fname as fund_fname , f.createtime as fund_createtime  from fundstock s left join fund f on f.fid = s.fid order by s.sid limit 5offset 10