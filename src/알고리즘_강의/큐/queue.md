## 큐(Queue)
- 큐는 줄을 서서 기다린다는 의미를 갖고있다.
- 그러니 먼저 줄슨사람은 먼처 나가야한다.

## 큐의 특징
- FIFO로 선입선출이다.
- LinkedList<>를 사용해서 구현된다.
- Queue에는 rear의 값을 확인하는 방법이 없기에 LinkedList로 형변환 시키거나
- Dequeue를 new ArrayDequeue로 구현해서 peekLast();를 사용해서 출력한다.