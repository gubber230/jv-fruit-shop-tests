package core.basesyntax.services;

import core.basesyntax.data.FruitTransaction;
import java.util.List;

public interface ShopService {

    void process(List<FruitTransaction> transactions);
}
