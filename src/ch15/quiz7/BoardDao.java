package ch15.quiz7;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();

        Board board1 = new Board("제목1", "내용1");
        Board board2 = new Board("제목2", "내용2");

        list.add(board1);
        list.add(board2);

        return list;
    }
}
