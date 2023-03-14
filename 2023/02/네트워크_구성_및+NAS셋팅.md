# 네트워크 구성 및 NAS 세팅

## 네트워크 세팅
1. Kt 공유기 세팅
   - 공유기 접속
     * 기본계정 : ktuser | homehub
     * 변경계정 : ltmetric | dpfxlapxmflr1!
   - DHCP수정
     * 코넷 1~100
     * 128~252
   - NAS IP 고정
     * 공유기에서 고정 
       * MAC주소로 고정하는 방법
       * 공유기에 고정 ip 할당 설정이 있음 ( 공유기마다 다르게 생김 )
     * NAS에서 고정
       * NAS에서 고정 IP를 쓰는 방법
         * NAS의 이더넷에 인터넷 프로토콜 버전 IP를 고정함
   - 포트포워딩 ( 안함 )
2. NAS 세팅 (labltmetric | qwerasdfg)
   - 관리자 계정 세팅
   - DISK 세팅
   - IP 세팅
   - 공유폴더 세팅
   - 사용자 세팅
   - 부가 세팅
     * SMB (기본값)
       * 윈도우 파일 공유
     * SVN
       * Docker로 설치
       * http://172.30.1.200:49154/svnadmin
     * FTP (안함)
   - 외부 접근 허용 여부 (안함)

- NAS 종류
  - 시놀로지 OS
