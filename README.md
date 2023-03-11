# collector-agent

서버에서 로그 등 파일에서 텍스트를 수집하여 카운트로 저장하는 Daemon Agent 프로그램
e.g) a.log 에서 "파일 생성 완료" 를 2초 주기로 수집 >> [파일 생성 완료][5]

# 아키텍처
setting.xml
startup.bat
collector-agent.jar

setting.xml 에서 수집할 로그 및 키워드 지정
startup.bat 를 통하여 Daemon 기동
