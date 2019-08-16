package com.alumniassociation.web.common.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alumniassociation.web.common.dao.SysOssDao;
import com.alumniassociation.web.common.entity.SysOss;
import com.alumniassociation.web.common.service.SysOssService;


@Service("sysOssService")
@Transactional
public class SysOssServiceImpl implements SysOssService {
	@Autowired
	private SysOssDao sysOssDao;
	
	@Override
	public SysOss get(String bucket){
		return sysOssDao.get(bucket);
	}

	@Override
	public List<SysOss> getList(Map<String, Object> map){
		return sysOssDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return sysOssDao.getCount(map);
	}

	@Override
	public void save(SysOss sysOss){
		sysOssDao.save(sysOss);
	}

	@Override
	public void update(SysOss sysOss){
		sysOssDao.update(sysOss);
	}

	@Override
	public void delete(String bucket){
		sysOssDao.delete(bucket);
	}

	@Override
	public void deleteBatch(String[] buckets){
		sysOssDao.deleteBatch(buckets);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			SysOss sysOss=get(id);
			sysOss.setState(stateValue);
            update(sysOss);
        }
    }
	
}
