//package org.example.demoopentracing;
//
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.client.RestTemplate;
//
//import static com.sun.org.apache.xml.internal.serialize.OutputFormat.Defaults.Encoding;
//
//@Configuration
//public class Config {
//
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
//        return restTemplateBuilder.build();
//    }
//
//    //	@Bean
//    public io.opentracing.Tracer jaegerTracer() {
//        return new Configuration("spring-boot", new Configuration.SamplerConfiguration(ProbabilisticSampler.TYPE, 1),
//                new Configuration.ReporterConfiguration())
//                .getTracer();
//    }
//
//    @Bean
//    public io.opentracing.Tracer zipkinTracer() {
//        OkHttpSender okHttpSender = OkHttpSender.builder()
//                .encoding(Encoding.JSON)
//                .endpoint("http://localhost:9411/api/v1/spans")
//                .build();
//        AsyncReporter<Span> reporter = AsyncReporter.builder(okHttpSender).build();
//        Tracing braveTracer = Tracing.newBuilder()
//                .localServiceName("spring-boot")
//                .reporter(reporter)
//                .traceId128Bit(true)
//                .sampler(Sampler.ALWAYS_SAMPLE)
//                .build();
//        return BraveTracer.create(braveTracer);
//    }
//
//}
