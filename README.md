# Layout_Study
Androiud layout study 


#제약레이아웃(ConstraintLayout)
제약 조건(Constraint)기반 모델
제약 조건을 사용해 화면을 구성하는 방법
안드로이드 스튜디오에서 자동으로 설정하는 디폴트 레이아웃

#리니어레이아웃(LinearLayout)
박스(Box)모델
한 쪽 방향으로 차례대로 뷰를 추가하며 화면을 구성하는 방법
뷰가 차지할 수 있는 사각형 영역을 할당

#상대레이아웃(RelativeLayout)
규칙(Rule)기반 모델
부모 컨테이너나 다른 뷰와의 상대적 위치로 화면을 구성하는 방법
여러 개의 뷰가 들어가면 중첩하여 쌓게 됨. 가장 단순하지만 여러 개의 뷰를 중첩한 후 각 뷰를 전환하여 
보여주는 방식으로 자주 사용함

#테이블레이아웃(TableLayout)
격자(Grid)모델 
격자 모양의 배열을 사용하여 화면을 구성하는 방법
HTML에서 많이 사용하는 정렬 방식과 유사하지만 많이 사용하지는 않음



#gravity속성설명

정렬 속성 값 / 설명
top / 대상 객체를 위쪽 끝 배치
bottom / 대상 객체를 아래쪽 끝 배치
left / 대상 객체를 왼쪽 끝 배치
right / 대상 객체를 오른쪽 끝 배치
center_vertical / 대상 객체를 수직 방향의 중앙에 배치
center_horizontal / 대상 객체를 수평 방향의 중앙에 배치
fill_vertical / 대상 객체를 수직 방향으로 여유 공간만큼 확대하여 채우기
fill_horizontal / 대상 객체를 수평 방향으로 여유 공간만큼 확대하여 채우기
center / 대상 객체를 수직 방향과 수평 방향의 중앙에 배치
fill / 대상 객체를 수직 방향과 수평 방향으로 여유 공간만큼 확대하여 채우기

clip_vertical / 대상 객체의 상하 길이가 여유 공간보다 클 경우에 남는 부분 잘라내기
ex) top|clip_vertical로 설정한 경우 아래쪽에 남는 부분 잘라내기

clip_horizontal / 대상 객체의 좌우 길이가 여유 공간보다 클 경우에 남는 부분 잘라내기
ex) right|clip_horizontal로 설정한 경우 왼쪽에 남는 부분 잘라내기
