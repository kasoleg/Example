package com.kasyanov.vk.mapper;

import com.kasyanov.vk.mvp.model.AdvertVO;
import com.kasyanov.vk.mvp.model.response.Advert;
import com.kasyanov.vk.mvp.model.response.Photo;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class AdvertMapper {
    @Inject
    public AdvertMapper() {
    }

    public List<AdvertVO> mapAdverts(List<Advert> advertList) {
        List<AdvertVO> advertVOList = new ArrayList<>();
        String imageUrl = null;

        for (Advert advert : advertList) {

            if (!advert.getPhotos().isEmpty()) {
                Photo photo = advert.getPhotos().get(0);
                if (photo.getXxl() != null) {
                    imageUrl = photo.getXxl();
                } else if (photo.getXl() != null) {
                    imageUrl = photo.getXl();
                } else if (photo.getL() != null) {
                    imageUrl = photo.getL();
                } else if (photo.getM() != null) {
                    imageUrl = photo.getM();
                } else if (photo.getS() != null) {
                    imageUrl = photo.getS();
                } else if (photo.getXs() != null) {
                    imageUrl = photo.getXs();
                }
            }

            String mileage;
            if (advert.getMileage().isEmpty()) {
                mileage = "новый";
            } else {
                mileage = advert.getMileage() + " км";
            }

            advertVOList.add(new AdvertVO(
                    advert.getBrand(),
                    advert.getModel(),
                    advert.getGeneration(),
                    advert.getPrices().getRUR() + " руб",
                    advert.getYear() + " год,",
                    mileage,
                    imageUrl)
            );
        }
        return advertVOList;
    }

}
