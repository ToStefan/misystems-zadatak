package stefan.tflc.misystems.zadatak.web.dto;

import java.util.Collection;

public class PageDTO<T> {

	private Integer currentPage;
	private Integer itemsPerPage;
	private Long totalItems;
	private Collection<T> items;

    public PageDTO() {

    }

    public PageDTO(Integer currentPage, Integer itemsPerPage, Long totalItems, Collection<T> items) {
		this.currentPage = currentPage;
		this.itemsPerPage = itemsPerPage;
		this.totalItems = totalItems;
		this.items = items;
	}

    public Integer getCurrentPage() {
        return this.currentPage;
	}

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
	}

    public Integer getItemsPerPage() {
        return this.itemsPerPage;
	}

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
	}

    public Long getTotalItems() {
        return this.totalItems;
	}

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
	}

    public Collection<T> getItems() {
        return this.items;
	}

    public void setItems(Collection<T> items) {
        this.items = items;
	}

}
