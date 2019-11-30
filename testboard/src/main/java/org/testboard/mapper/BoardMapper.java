package org.testboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.testboard.domain.BoardAttachVO;
import org.testboard.domain.BoardVO;
import org.testboard.domain.Criteria;

public interface BoardMapper {

	public List<BoardVO> getList();

	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO board);

	public Integer insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(Long bno);

	public int update(BoardVO board);

	public int getTotalCount(Criteria cri);

	public void updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);
	
	public int updateViewCnt(@Param("bno") Long bno);
	
	public List<BoardAttachVO> findByBno(Long bno);

}
 