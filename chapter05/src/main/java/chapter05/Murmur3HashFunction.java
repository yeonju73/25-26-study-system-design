package chapter05;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;

// MurmurHash3: 분산 및 속도에 최적화된 비보안 해시
public class Murmur3HashFunction implements HashFunction {
    @Override
    public int hash(Object obj) {
        byte[] bytes = obj.toString().getBytes(StandardCharsets.UTF_8);
        return Hashing.murmur3_32_fixed().hashBytes(bytes).asInt();
    }
}
