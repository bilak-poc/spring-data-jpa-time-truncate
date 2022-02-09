package com.example.springdatajpatimetruncate;

import com.example.springdatajpatimetruncate.data.entity.SampleObject;
import com.example.springdatajpatimetruncate.data.repository.SampleObjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.OffsetDateTime;
import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class SpringDataJpaTimeTruncateApplicationTests {

    @Autowired
    private SampleObjectRepository sampleObjectRepository;

    @Test
    void saveObjectShouldMatchLoadObject() {
        final SampleObject sample = new SampleObject();
        sample.setBusinessDate(OffsetDateTime.now());
        sample.setId(UUID.randomUUID());

        final SampleObject savedSample = sampleObjectRepository.save(sample);

        final SampleObject loadedSample = sampleObjectRepository.findById(savedSample.getId()).orElseThrow();

        assertThat(savedSample, is(loadedSample));

    }

}
