import './styles.css';
import StepsHeader from "./StepsHeader";
import ProductsList from './ProductsList';

function Orders() {
    return(
        <div className="orders-container">
            <StepsHeader />
            <ProductsList />
        </div>
    )
}

export default Orders;