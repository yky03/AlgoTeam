#include<iostream>
#include<cstring>
int a[50][50] = {};

int main() {
  int n,m,r,c,d;
  int answer=0;
  std::cin >> n>>m;
  std::cin >> r>>c>>d;
  //공간 그리는 입력 받기(n,m행렬)

  for (size_t i = 0; i < n; i++) {
    /* code */
    for (size_t j = 0; j < m; j++) {
      /* code */
      std::cin >> a[i][j];
    }
  }

  while (true) {
    if(a[r][c] == 0){
      //  <<1>>
      a[r][c] =2;
      std::cout << "count!!!" << '\n';
      answer++;
      for (size_t i = 0; i < n; i++) {
        /* code */
        for (size_t j = 0; j < m; j++) {
          /* code */
          std::cout << a[i][j];
        }
        std::cout << '\n';
      }
    }else{
      //  <<2>>-1
      int temp = d;
      for (size_t i = 0; i < 4; i++) {
        /* code */
        d = d-1;
        if(d == -1) d =3;
        std::cout << d << '\n';
        int cursor;
        switch (d) {
          case 0:cursor = a[r-1][c];break;
          case 1:cursor = a[r][c+1];break;
          case 2:cursor = a[r+1][c];break;
          case 3:cursor = a[r][c-1];break;
        }
        if(cursor == 0){
          switch (d) {
            case 0:r = r-1;break;
            case 1:c = c+1;break;
            case 2:r = r+1;break;
            case 3:c = c-1;break;
          }
          break;
        }
      }
      //3.네 방향 모두 청소가 이미 되어있거나 벽인 경우,
      //바라보는 방향을 유지한 채로 한 칸 후진을 하고 2번으로 돌아간다.
    
      if (temp ==d) {
        /* code */
        d = d-1;
        if(d == -1) d =3;
        d = d-1;
        if(d == -1) d =3;
        std::cout <<"what = "<<answer << '\n';
        switch (d) {
          case 0:r = r-1;break;
          case 1:c = c+1;break;
          case 2:r = r+1;break;
          case 3:c = c-1;break;
        }
        std::cout << "aaa" <<a[r][c] << '\n';
      }
      //4. 네 방향 모두 청소가 이미 되어있거나 벽이면서,
      // 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.
      if(a[r][c]==1){
        std::cout <<"answer = "<<answer << '\n';
        return 0;
      }
    }

  }
return 0;
}


//공간에서 움직이기
//case 0   :   d = 0  r -1 , c  북쪽
//case 1   :   d = 1  r , c+1   동쪽
//case 2   :   d = 2  r+1 , c   남쪽
//case 3   :   d = 3  r , c-1   서쪽
//2-1 왼쪽 방향 = d = d-1
//2-2 해당 칸이 0이라면 1로 변경
//    해당 칸이 1 이라면 또 d = d-1
//만약 d 4개 모두 1이면  d = d+2 강제 수행
//뒤쪽이 벽이면 종료 ( 벽 != 청소된곳)
//청소된곳 = 2




/*
n/6이 0이면 01호
1이면 02호
n%6이 1이면 1층
2이면 2층...
*/
