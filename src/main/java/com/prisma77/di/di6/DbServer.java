package com.prisma77.di.di6;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class DbServer {
        @Value("${com.prisma77.serverName3}")
        private String serverName;

        @Value("${com.prisma77.severUrl3}") // properties 파일의 키 이름에 맞게 수정
        private String serverUrl;

        @Value("${com.prisma77.serverPort3}")
        private int serverPort;

        @Value("${com.prisma77.connectionCount3}")
        private int connectionCount;

}


