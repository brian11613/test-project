package test.com.abu;

import brave.Tracer;
import com.abu.TestProjectApplication;
import com.abu.dal.mapper.MbrMemberPhoneOpenIdRefDOMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Objects;

/**
 * @author spring-cloud-template-nacos-archetype
 * @create_time: 2020/5/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestProjectApplication.class)
@Slf4j
public class TestProjectApplicationTest {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MbrMemberPhoneOpenIdRefDOMapper mbrMemberPhoneOpenIdRefDOMapper;

    @Autowired
    private Tracer tracer;

    @Test
    public void loadContextTest() {
        Assert.assertNotNull(mbrMemberPhoneOpenIdRefDOMapper);
        long count = mbrMemberPhoneOpenIdRefDOMapper.countByExample(null);
        if (Objects.nonNull(tracer) && Objects.nonNull(tracer.currentSpan())) {
            log.info("====================TraceId:{}", tracer.currentSpan().context().traceIdString());
        }
        log.info("=======================> count: {}", count);
    }
}
