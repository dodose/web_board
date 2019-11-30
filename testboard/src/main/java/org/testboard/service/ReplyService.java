package org.testboard.service;

import java.util.List;

import org.testboard.domain.Criteria;
import org.testboard.domain.ReplyPageDTO;
import org.testboard.domain.ReplyVO;

public interface ReplyService {

	public int register(ReplyVO vo);

	public ReplyVO get(Long rno);

	public int modify(ReplyVO vo);

	public int remove(Long rno);

	public List<ReplyVO> getList(Criteria cri, Long bno);
	
	public ReplyPageDTO getListPage(Criteria cri, Long bno);

}
