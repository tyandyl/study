package Metrics;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/**
 * Metrics是一个Java库，可以对系统进行监控，统计一些系统的性能指标。
 * 比如一个系统后台服务，我们可能需要了解一下下面的一些情况：
 1、每秒钟的请求数是多少（TPS）？
 2、平均每个请求处理的时间？
 3、请求处理的最长耗时？
 4、等待处理的请求队列长度？
 5、又或者一个缓存服务：缓存的命中率？平均查询缓存的时间？
 基本上每一个服务、应用都需要做一个监控系统，这需要尽量以少量的代码，实现统计某类数据的功能。
 MetricRegistry类是Metrics的核心，它是存放应用中所有metrics的容器，也是我们使用 Metrics 库的起点。
 MetricRegistry registry = new MetricRegistry();

 Metrics 数据展示
 Metrics 提供了 Report 接口，用于展示 metrics 获取到的统计数据。
 metrics-core中主要实现了四种 reporter： JMX ，console， SLF4J， 和 CSV。

 Metrics的五种类型:
 Gauges
 Counters
 Meters
 Histograms
 Timers

 Gauges:最简单的度量指标，只有一个简单的返回值，或者叫瞬时状态，例如，我们想衡量一个待处理队列中任务的个数。

 */
public class GaugeTest {
    public static Queue<String> q = new LinkedList<String>();

    public static void main(String[] args) throws InterruptedException {

        MetricRegistry metricRegistry = new MetricRegistry();
        ConsoleReporter reporter = ConsoleReporter.forRegistry(metricRegistry).build();
        //Metrics需要指定监控Reporter的展示输出方式，例如GaugeTest，
        // 初始化ConsoleReporter需要设置统计的周期，这里设置的是1s。
        reporter.start(1, TimeUnit.SECONDS);

        metricRegistry.register(MetricRegistry.name(GaugeTest.class, "queue", "size"),
                new Gauge<Integer>(){
                    public Integer getValue() {
                        return q.size();
                    }
                });

        while (true)
        {
            Thread.sleep(1000);
            q.add("张永辉");
        }
    }
}
